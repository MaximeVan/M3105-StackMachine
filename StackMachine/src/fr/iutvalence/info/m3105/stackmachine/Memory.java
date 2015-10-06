package fr.iutvalence.info.m3105.stackmachine;

public interface Memory {

	public abstract int getStartAddress();

	public abstract void write(int currentAddress, int instructionParam);

}