//22. Generate Parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> result=new ArrayList<>();
        returnGeneratedParenthesis(result,"",0,0,n);
        return result;
 }

public void returnGeneratedParenthesis(List<String>result,String current,int openingParenthesis,int closingParenthesis,int n)
{
  if(current.length()==2*n)
  {
    result.add(current);
    return;
  }

  if(openingParenthesis<n)
  {
    returnGeneratedParenthesis(result,current+"(",openingParenthesis+1,closingParenthesis,n);
  }
  
  if(closingParenthesis<openingParenthesis)
  {
    returnGeneratedParenthesis(result,current+")",openingParenthesis,closingParenthesis+1,n);
  }
}

}

