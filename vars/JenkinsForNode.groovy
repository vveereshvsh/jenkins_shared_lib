
def call(String repoURl){
  
  pipeline{
    
    agent any
    
    tools{
     
      nodejs 'node16'
      
    }
    
    stages{
      stage("Checkout SCM"){
       
        steps{ 
          
          git branch: 'master',
	           url: "${repoURl}"
   
        }
              
      }
      stage("Npm Install"){
        steps{
          
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
