package mainclient.fieldTypeChanged;

import java.util.ArrayList;
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

	public void accessAndWrite() {
		FieldTypeChanged ftc = new FieldTypeChanged();
		
		ftc.unchangedPrimitive = 2;
		ftc.unchangedReference = new A();
		
		ftc.changedPrimitive = 2;
		ftc.changedReference = new A();
		
		ftc.widenPrimitive = 23;
		ftc.widenReference = new B();
		
		ftc.narrowPrimitive = 2;
		ftc.narrowReference = new A();
		
		ftc.boxing = 2;
		ftc.unboxing = 2;
		ftc.changedBoxing = false;
		
		ftc.narrowReferenceList = new ArrayList<A>();
		ftc.widenReferenceList = new ArrayList<B>();
		ftc.changedReferenceList = new ArrayList<A>();
		
		ftc.narrowListReference = new ArrayList<A>();
		ftc.widenListReference = new ArrayList<A>(); 
		
		ftc.narrowPrimitiveArray = new int[1];
		ftc.widenPrimitiveArray = new int[1];
		
		ftc.boxPrimitiveArray = new int[1];
		ftc.unboxPrimitiveArray = new Integer[1];
		
		ftc.narrowReferenceArray = new A[1];
		ftc.widenReferenceArray = new B[1];
		ftc.changedReferenceArray  = new A[1];
	}
	
	public void accessAndWriteCompatible() {
		FieldTypeChanged ftc = new FieldTypeChanged();
		
		ftc.unchangedPrimitive = (int) 2.2;
		ftc.unchangedReference = new B();
		
		ftc.changedPrimitive = (int) 2.2;
		ftc.changedReference = new B();
		
		ftc.widenPrimitive = (char) 23;
		ftc.widenReference = new B();
		
		ftc.narrowPrimitive = (short) 2.2;
		ftc.narrowReference = new B();
		
		ftc.boxing = new Integer(2);
		ftc.unboxing = new Integer(2);
		ftc.changedBoxing = (2 == 2);
		
		ftc.narrowReferenceList = new ArrayList<A>() {};
		ftc.widenReferenceList = new ArrayList<B>() {};
		ftc.changedReferenceList = new ArrayList<A>() {};
		
		ftc.narrowListReference = new ArrayList<A>() {};
		ftc.widenListReference = new ArrayList<A>() {};
		
		ftc.narrowPrimitiveArray = new int[1];
		ftc.widenPrimitiveArray = new int[1];
		
		ftc.boxPrimitiveArray = new int[1];
		ftc.unboxPrimitiveArray = new Integer[1];
		
		ftc.narrowReferenceArray = new A[1];
		ftc.widenReferenceArray = new B[1];
		ftc.changedReferenceArray  = new A[1];
	}
}
