package fr.iutvalence.info.m3105.stackmachine;

abstract class AbstractStack implements Stack
{
	protected int size;
	
	public AbstractStack(int size)
	{
		this.size = size;
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Stack#getSize()
	 */
	@Override
	public int getSize() {
		return size;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Stack#push(int)
	 */
	@Override
	public void push(int arg){
		// TODO
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Stack#pop(int)
	 */
	@Override
	public void pop(int arg){
		// TODO
	}

}
