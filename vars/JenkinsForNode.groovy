
def call(String repoURl){
  
  pipeline{
    
    agent any
    
    tools{
     
      nodejs 'node16'
      
    }
    
    stages{
      stage("Checkout SCM"){
       
        step{ 
          
          git branch: 'master',
	           url: "${repoURl}"
   
        }
              
      }
      stage("Npm Install"){
        step{
          
         sh "npm install" 
          
        }
      }
    }
    
    post{
      
      always{
        
        echo "Running post condition"
        
      }
      
    }
    
  }

}
