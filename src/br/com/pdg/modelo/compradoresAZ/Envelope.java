package br.com.pdg.modelo.compradoresAZ;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Envelope", namespace="http://www.w3.org/2003/05/soap-envelope")
public class Envelope {
	
	
	private Body body;

	@XmlElement(name="Body", namespace="http://www.w3.org/2003/05/soap-envelope")
	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
	
}
