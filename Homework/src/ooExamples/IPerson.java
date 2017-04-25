package ooExamples;
//这是个接口，它不负责具体做什么事情，只是规定必须要做这个事情
public interface IPerson {
	//工作，但是具体做什么工作或者工作的内容，是不允许在里面实现的
	void Work(int hours);
}
