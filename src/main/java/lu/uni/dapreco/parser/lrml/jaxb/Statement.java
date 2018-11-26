package lu.uni.dapreco.parser.lrml.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ConstitutiveStatement", namespace = LegalRuleML.lrmlNS)
public class Statement {
	
	@XmlElement(name = "Rule", namespace = LegalRuleML.rulemlNS)
	private Rule rule;

}