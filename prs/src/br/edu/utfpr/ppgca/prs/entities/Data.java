package br.edu.utfpr.ppgca.prs.entities;

import br.edu.utfpr.ppgca.prs.core.Clock;

public class Data extends AbstractEpistemicEntity {

	public static final String SELF = "SELF";

	protected final String content;
	protected final String source;

	protected Integer lastActivation = 0;

	public Data(String content) {
		this.content = content;
		this.source = SELF;
	}

	public Data(String content, String source) {
		super();
		this.content = content;
		this.source = source;
	}

	public String getContent() {
		return content;
	}

	public String getSource() {
		return source;
	}

	public void updateLastActivation(Clock clock) {
		this.lastActivation = clock.getCounter();
	}

	public Integer getLastActivation() {
		return this.lastActivation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Data [content=" + content + ", source=" + source + "]";
	}

}
