#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.example.twitter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named("tweetAdapter")
public class TweetContentOfflineDelegate implements JavaDelegate {

  public void execute(DelegateExecution execution) throws Exception {
    String content = (String) execution.getVariable("content");

    System.out.println("${symbol_escape}n${symbol_escape}n${symbol_escape}n${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_escape}n${symbol_escape}n${symbol_escape}n");
    System.out.println("NOW WE WOULD TWITTER: '" + content + "'");
    System.out.println("${symbol_escape}n${symbol_escape}n${symbol_escape}n${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_pound}${symbol_escape}n${symbol_escape}n${symbol_escape}n");
  }

}
