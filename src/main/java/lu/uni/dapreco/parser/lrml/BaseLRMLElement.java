package lu.uni.dapreco.parser.lrml;

import org.w3c.dom.Element;
import org.w3c.dom.Node;

import lu.uni.dapreco.parser.XPathParser;

public class BaseLRMLElement {

	protected Element root;

	protected XPathParser xpath;

	public BaseLRMLElement(Element node, XPathParser xp) {
		root = node;
		xpath = xp;
	}

	public Element getRoot() {
		return root;
	}

	public void remove() {
		Node next = root.getNextSibling();
		Node parent = root.getParentNode();
		parent.removeChild(root);
		if (next != null && next.getNodeType() == Node.TEXT_NODE && next.getTextContent().trim().isEmpty())
			parent.removeChild(next);
	}

}
