package br.edu.utfpr.ppgca.prs.entities;

public class Message extends Data {

	final String source;

	public Message(final String content, final String source) {
		super(content);
		this.source = source;
	}

}
