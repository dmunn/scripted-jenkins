// Declare variables required for jobs
def jobName = ["test1", "test2", "test3", "test4"]

def jobParams = [
  param1:"Param1",
  param2:"Param2"
]

// Method allowing for the creation of multiple jobs using the jobName list to iterate over.
def genericJob(jobName, jobParams) {
  job(jobName){
    
    parameters {
      choiceParam("${jobParams.param1}", ['option 1 (default)', 'option 2', 'option 3'], 'Parameter 1 Description')
      choiceParam("${jobParams.param2}", ['option 2 (default)', 'option 1', 'option 3'], 'Parameter 2 Description')  
    }
  
    steps {
      shell('echo Hello World!')
    }
  }
}

// Call method passing one item of jobName in at a time.
for (job in jobName) {
  genericJob(job, jobParams)
}