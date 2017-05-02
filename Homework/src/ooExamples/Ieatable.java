package ooExamples;

public interface Ieatable {
	void eat();
	//利用方法的重载（方法名一样，但是参数一定不一样）专门为人类定义的吃饭，因为可能还有动物的吃饭
	void eat(clsPerson clp,String food);
}
