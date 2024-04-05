package de.icesales.icemanager.view;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import de.icesales.icemanager.model.jsonschema2pojo.OrderBase;
import de.icesales.icemanager.model.jsonschema2pojo.Position;
import de.icesales.icemanager.service.SessionData;
import jakarta.inject.Inject;
import util.ProductsEnum;

public abstract class AbstractView {

	@Inject
	private SessionData sessionData;

	private int w2B;
	private int w5B;
	private int w15B;
	private int wL;

	private int c2B;
	private int c5B;
	private int c15B;
	private int cL;

	public void calculate(List<OrderBase> orders) {
		if (orders.isEmpty())
			return;

		for (OrderBase o : orders) {
			for (Position p : o.getPositions()) {
				if (StringUtils.equals(p.getName(), ProductsEnum.W2B.getLabel())) {
					int q = getW2B() + Integer.parseInt(p.getQuantity());
					setW2B(q);
				}
				if (StringUtils.equals(p.getName(), ProductsEnum.W5B.getLabel())) {
					int q = getW5B() + Integer.parseInt(p.getQuantity());
					setW5B(q);
				}
				if (StringUtils.equals(p.getName(), ProductsEnum.W15B.getLabel())) {
					int q = getW15B() + Integer.parseInt(p.getQuantity());
					setW15B(q);
				}
				if (StringUtils.equals(p.getName(), ProductsEnum.WL.getLabel())) {
					int q = getwL() + Integer.parseInt(p.getQuantity());
					setwL(q);
				}

				if (StringUtils.equals(p.getName(), ProductsEnum.C2B.getLabel())) {
					int q = getC2B() + Integer.parseInt(p.getQuantity());
					setC2B(q);
				}
				if (StringUtils.equals(p.getName(), ProductsEnum.C5B.getLabel())) {
					int q = getC5B() + Integer.parseInt(p.getQuantity());
					setC5B(q);
				}
				if (StringUtils.equals(p.getName(), ProductsEnum.C15B.getLabel())) {
					int q = getC15B() + Integer.parseInt(p.getQuantity());
					setC15B(q);
				}
				if (StringUtils.equals(p.getName(), ProductsEnum.CL.getLabel())) {
					int q = getcL() + Integer.parseInt(p.getQuantity());
					setcL(q);
				}
			}
		}
	}

	public SessionData getSessionData() {
		return sessionData;
	}

	public int getW2B() {
		return w2B;
	}

	public void setW2B(int w2b) {
		w2B = w2b;
	}

	public int getW5B() {
		return w5B;
	}

	public void setW5B(int w5b) {
		w5B = w5b;
	}

	public int getW15B() {
		return w15B;
	}

	public void setW15B(int w15b) {
		w15B = w15b;
	}

	public int getwL() {
		return wL;
	}

	public void setwL(int wL) {
		this.wL = wL;
	}

	public int getC2B() {
		return c2B;
	}

	public void setC2B(int c2b) {
		c2B = c2b;
	}

	public int getC5B() {
		return c5B;
	}

	public void setC5B(int c5b) {
		c5B = c5b;
	}

	public int getC15B() {
		return c15B;
	}

	public void setC15B(int c15b) {
		c15B = c15b;
	}

	public int getcL() {
		return cL;
	}

	public void setcL(int cL) {
		this.cL = cL;
	}

}
