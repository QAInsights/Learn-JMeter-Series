### Run JMeter Container

```
docker run justb4/jmeter -n -t bin/examples/CSVSample.jmx -l ./bin/examples/Run1.jtl
```

### Copy contents from container to local

```
docker cp 936bd3ac0c32:/opt/apache-jmeter-5.3/bin/examples .
```
