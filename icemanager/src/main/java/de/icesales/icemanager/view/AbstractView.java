package de.icesales.icemanager.view;

import de.icesales.icemanager.service.SessionData;
import jakarta.inject.Inject;

public abstract class AbstractView {

	@Inject
	private SessionData sessionData;

	public SessionData getSessionData() {
		return sessionData;
	}

}
