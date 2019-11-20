package com.kumar.FunPart;

import com.kumar.FunFactory.FunPartAbstractFactory;
import com.kumar.FunFactory.IFunPart;

public class FunPartFactory implements FunPartAbstractFactory<IFunPart> {

	@Override
	public IFunPart create(Integer requirment) {
		switch(requirment)
		{
		case 1: return new FunNormal();
		case 2: return new FunWithFizz();
		case 3: return new FunWithBuzz();
		case 4: return new FunWithFizzBuzz();
		}
		return null;
	}

}
