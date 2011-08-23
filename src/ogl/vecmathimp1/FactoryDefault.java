package ogl.vecmathimp1;

import ogl.vecmath.Color;
import ogl.vecmath.Factory;
import ogl.vecmath.Matrix;
import ogl.vecmath.Vector;

public class FactoryDefault implements Factory{

    @Override
    public Vector vec(float nx, float ny, float nz) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Vector vecX() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Vector vecY() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Vector vecZ() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int vecSize() {
	// TODO Auto-generated method stub
	return 0;
    }

    @Override
    public Matrix matIdent() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix mat(float m00, float m01, float m02, float m03, float m10,
	    float m11, float m12, float m13, float m20, float m21, float m22,
	    float m23, float m30, float m31, float m32, float m33) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix mat(float[] elements) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix mat(Vector b0, Vector b1, Vector b2) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matTrans(Vector t) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matTrans(float x, float y, float z) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matRot(Vector axis, float angle) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matRot(float ax, float ay, float az, float angle) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matScale(Vector s) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matScale(float x, float y, float z) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matLookAt(Vector eye, Vector center, Vector up) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matFrustum(float left, float right, float bottom, float top,
	    float zNear, float zFar) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Matrix matPerspective(float fovy, float aspect, float zNear,
	    float zFar) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Color col(float r, float g, float b) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public int colSize() {
	// TODO Auto-generated method stub
	return 0;
    }

}
