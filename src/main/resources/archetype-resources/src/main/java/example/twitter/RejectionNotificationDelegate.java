#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.example.twitter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named("emailAdapter")
public class RejectionNotificationDelegate implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {
    String content = (String) execution.getVariable("content");
    String comments = (String) execution.getVariable("comments");

    System.out.println("Hi!${symbol_escape}n${symbol_escape}n"
           + "Unfortunately your tweet has been rejected.${symbol_escape}n${symbol_escape}n"
           + "Original content: " + content + "${symbol_escape}n${symbol_escape}n"
           + "Comment: " + comments + "${symbol_escape}n${symbol_escape}n"
           + "Sorry, please try with better content the next time :-)");
  }

}
