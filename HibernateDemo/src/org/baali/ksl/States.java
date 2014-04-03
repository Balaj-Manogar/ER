package org.baali.ksl;

import javax.persistence.*;


public class States
{
	
	private int sid;
	private String name;
	private short isUnionTerritory;
	
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public short getIsUnionTerritory()
	{
		return isUnionTerritory;
	}
	public void setIsUnionTerritory(short isUnionTerritory)
	{
		this.isUnionTerritory = isUnionTerritory;
	}
	
	

}
