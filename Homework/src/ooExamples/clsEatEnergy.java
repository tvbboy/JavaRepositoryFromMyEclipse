package ooExamples;

public class clsEatEnergy implements Ieatable{
    private clsRobert _clsrobert;
	@Override
	public void eat(clsPerson clp) {
		// TODO Auto-generated method stub
		_clsrobert=(clsRobert)clp;
		if(_clsrobert.lvl<100.0f)
			_clsrobert.lvl+=10.0f;
		else
			System.out.print("ÎÒ³Ô±¥ÁË");
		
	}

	
	
}
