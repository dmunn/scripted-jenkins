// Declare variables required for all jobs
def jobNames = ["test1",
                "test2",
                "test3",
                "test4"
]

def jobParams = [
  param1:"Param1",
  param2:"Param2"
]	

// Call method passing one item of jobNames in at a time.
job('e2e-downstream') {
  steps {
    for (job in jobNames) {
      downstreamParameterized {
        trigger(job) {
          block {
            buildStepFailure('FAILURE')
            failure('FAILURE')
            unstable('UNSTABLE')
          }
          parameters {
            predefinedProps('param1': ["${jobParams.param1}"],
                            'param2': ["${jobParams.param2}"])
          }
        }
      }
    }
  }
}