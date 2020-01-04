## worker-metrics

A monitoring application for a distributed system. The application collects memory usage from several running workers and visualizes it.

### Requirements:

1. The worker code is available here: https://github.com/hazelcast/sample-worker

2. The monitoring application takes a file containing the list of the workers as input and needs to connect to all the workers in the given file. The list of workers will be configured in YAML format:

   ```yaml
   metricsources:
     workers:
       - worker1_host:port
       - worker2_host:port
       ...
       - workerN_host:port
   ```

3. The application provides a URL to load in the browser and get a UI where the user can see a time graph of the memory usage for each worker. The graph must show one line per worker. 

   Optional requirements (you may do them in any order):
	
   1. Calculate and graph the aggregated total memory usage of all the workers in a single graph. Note that the timestamps from different workers will not be aligned perfectly. Please document how you handle the case of missing data points.
   2. Graph the memory allocation rate of each node, averaged over one second.

### Tech stack:

- Kotlin
- A web framework Quarkus
- For the front-end React and D3.js with TypeScript will be used
- For the frontend-to-backend communication WebSockets will be used
