package fr.iutvalence.info.m3105.stackmachine;

public interface CPU
{

	public void run();

	public void wireToProgramMemory(Memory programMemory);

	public void setPC(int address);

	public void clearStacks();

	public void wireToExpStack(Stack expStack);

	public void wireToCallStack(Stack callStack);

	public void wireToIoSubsystem(IO ioSystem2);

}