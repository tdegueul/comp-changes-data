package mainclient.fieldTypeChanged;

import java.util.Collection;
import java.util.List;

import main.fieldTypeChanged.A;
import main.fieldTypeChanged.B;
import main.fieldTypeChanged.FieldTypeChanged;

public class FieldTypeChangedFA {
	public void accessAndAssign() {
		FieldTypeChanged ftc = new FieldTypeChanged();
		
		int a = ftc.unchangedPrimitive;
		A b = ftc.unchangedReference;
		
		int c = ftc.changedPrimitive;
		A d = ftc.changedReference;
		
		byte e = ftc.widenPrimitive;
		B f = ftc.widenReference;
		
		short g = ftc.narrowPrimitive;
		A h = ftc.narrowReference;
		
		int i = ftc.boxing;
		Integer j = ftc.unboxing;
		boolean k = ftc.changedBoxing;
		
		List<A> l = ftc.narrowReferenceList;
		List<B> m = ftc.widenReferenceList;
		List<A> n = ftc.changedReferenceList;
		
		List<A> o = ftc.narrowListReference;
		List<A> p = ftc.widenListReference; 
		
		int[] q = ftc.narrowPrimitiveArray;
		int[] r = ftc.widenPrimitiveArray;
		
		int[] s = ftc.boxPrimitiveArray;
		Integer[] t = ftc.unboxPrimitiveArray;
		
		A[] u = ftc.narrowReferenceArray;
		B[] v = ftc.widenReferenceArray;
		A[] w = ftc.changedReferenceArray;
	}
	
	public void accessAndAssignCompatible() {
		FieldTypeChanged ftc = new FieldTypeChanged();
		
		Integer a = ftc.unchangedPrimitive;
		Object b = ftc.unchangedReference;
		
		long c = ftc.changedPrimitive;
		Object d = ftc.changedReference;
		
		short e = ftc.widenPrimitive;
		A f = ftc.widenReference;
		
		int g = ftc.narrowPrimitive;
		Object h = ftc.narrowReference;
		
		double i = ftc.boxing;
		int j = ftc.unboxing;
		Boolean k = ftc.changedBoxing;
		
		Collection<A> l = ftc.narrowReferenceList;
		List<? extends A> m = ftc.widenReferenceList;
		Collection<? extends A> n = ftc.changedReferenceList;
		
		Collection<A> o = ftc.narrowListReference;
		List<? extends A> p = ftc.widenListReference; 
		
		int[] q = ftc.narrowPrimitiveArray;
		int[] r = ftc.widenPrimitiveArray;
		
		int[] s = ftc.boxPrimitiveArray;
		Integer[] t = ftc.unboxPrimitiveArray;
		
		Object[] u = ftc.narrowReferenceArray;
		A[] v = ftc.widenReferenceArray;
		Object[] w = ftc.changedReferenceArray;
	}
}
