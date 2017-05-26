package org.sky.axis2.helloworld;

import javax.xml.namespace.QName;

import org.apache.axiom.om.OMElement;
import org.apache.axis2.client.async.AxisCallback;
import org.apache.axis2.context.MessageContext;

public class HelloWorldNonBlockCB implements AxisCallback {

	private boolean complete = false;
	 
    public void onMessage(MessageContext msgContext) {
              System.out.println(msgContext.getEnvelope().getBody());
              OMElement element = msgContext.getEnvelope().getBody()
                                .getFirstElement();
              OMElement result = element.getFirstChildWithName(new QName(
                                "http://helloworld.axis2.sky.org", "name"));
              System.out.println(result.getText());
              synchronized (this) {
                       this.notify();
              }
    }

    public boolean isComplete() {
              return complete;
    }

    public void onFault(MessageContext msgContext) {
              System.out.println(msgContext.getEnvelope().getBody().getFault()
                                .toString());
              synchronized (this) {
                       this.notify();
              }
    }

    public void onError(Exception e) {
              e.printStackTrace();
              synchronized (this) {
                       this.notify();
              }
    }

    public void onComplete() {
              this.complete = true;
              synchronized (this) {
                       this.notify();
              }
    }

}
