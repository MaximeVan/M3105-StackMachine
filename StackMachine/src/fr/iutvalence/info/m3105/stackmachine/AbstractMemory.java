package fr.iutvalence.info.m3105.stackmachine;

abstract class AbstractMemory implements Memory
{
	private int startAddress;
	private int i;
	private int j;

	public AbstractMemory(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#getStartAddress()
	 */
	@Override
	public int getStartAddress()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#write(int, int)
	 */
	@Override
	public void write(int currentAddress, int instructionParam) {
		// TODO Auto-generated method stub
		
	}

}
