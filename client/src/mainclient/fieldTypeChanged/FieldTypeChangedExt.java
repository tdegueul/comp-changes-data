package mainclient.fieldTypeChanged;

import java.util.List;

import main.fieldTypeChanged.A;
import main.fieldTypeChanged.B;
import main.fieldTypeChanged.FieldTypeChanged;

public class FieldTypeChangedExt extends FieldTypeChanged {

	public void accessAndAssign() {
		int a1 = unchangedPrimitive;
		int a2 = this.unchangedPrimitive;
		int a3 = super.unchangedPrimitive;
		A b1 = unchangedReference;
		A b2 = this.unchangedReference;
		A b3 = super.unchangedReference;
		
		int c1 = changedPrimitive;
		int c2 = this.changedPrimitive;
		int c3 = super.changedPrimitive;
		A d1 = changedReference;
		A d2 = this.changedReference;
		A d3 = super.changedReference;
		
		byte e1 = widenPrimitive;
		byte e2 = this.widenPrimitive;
		byte e3 = super.widenPrimitive;
		B f1 = widenReference;
		B f2 = this.widenReference;
		B f3 = super.widenReference;
		
		short g1 = narrowPrimitive;
		short g2 = this.narrowPrimitive;
		short g3 = super.narrowPrimitive;
		A h1 = narrowReference;
		A h2 = this.narrowReference;
		A h3 = super.narrowReference;
		
		int i1 = boxing;
		int i2 = this.boxing;
		int i3 = super.boxing;
		Integer j1 = unboxing;
		Integer j2 = this.unboxing;
		Integer j3 = super.unboxing;
		boolean k1 = changedBoxing;
		boolean k2 = this.changedBoxing;
		boolean k3 = super.changedBoxing;
		
		List<A> l1 = narrowReferenceList;
		List<A> l2 = this.narrowReferenceList;
		List<A> l3 = super.narrowReferenceList;
		List<B> m1 = widenReferenceList;
		List<B> m2 = this.widenReferenceList;
		List<B> m3 = super.widenReferenceList;
		List<A> n1 = changedReferenceList;
		List<A> n2 = this.changedReferenceList;
		List<A> n3 = super.changedReferenceList;
		
		List<A> o1 = narrowListReference;
		List<A> o2 = this.narrowListReference;
		List<A> o3 = super.narrowListReference;
		List<A> p1 = widenListReference;
		List<A> p2 = this.widenListReference;
		List<A> p3 = super.widenListReference;
		
		int[] q1 = narrowPrimitiveArray;
		int[] q2 = this.narrowPrimitiveArray;
		int[] q3 = super.narrowPrimitiveArray;
		int[] r1 = widenPrimitiveArray;
		int[] r2 = this.widenPrimitiveArray;
		int[] r3 = super.widenPrimitiveArray;
		
		int[] s1 = boxPrimitiveArray;
		int[] s2 = this.boxPrimitiveArray;
		int[] s3 = super.boxPrimitiveArray;
		Integer[] t1 = unboxPrimitiveArray;
		Integer[] t2 = this.unboxPrimitiveArray;
		Integer[] t3 = super.unboxPrimitiveArray;
		
		A[] u1 = narrowReferenceArray;
		A[] u2 = this.narrowReferenceArray;
		A[] u3 = super.narrowReferenceArray;
		B[] v1 = widenReferenceArray;
		B[] v2 = this.widenReferenceArray;
		B[] v3 = super.widenReferenceArray;
		A[] w1 = changedReferenceArray;
		A[] w2 = this.changedReferenceArray;
		A[] w3 = super.changedReferenceArray;
	}
}
