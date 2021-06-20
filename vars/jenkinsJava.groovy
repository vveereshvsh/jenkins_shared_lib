 
def call(string repoURL){

 pipeline{
 
   pipeline{

      agent any

      tools{

         maven 'maven'
    
      }
      stages{
         stage("Checkout code"){
             steps{
               git branch: 'master',
	           url: "${repoURl}"
	    
         }  
         stage("Build")
	     steps{

               sh "mvn clean package"

	  }
         }
      }
   }
 }

}
