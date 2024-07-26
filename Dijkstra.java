public class Dijkstra{
    public static Map<Integer,Integer>dijkstra(Map<Integer,Map<Integer,Integer>>graph,int source){
        Map<Integer,Integer>distances=new HashMap<>();
        for(Integer vertex :  graph.keySet()){
            distance.put(vertex,Integer.MAX_VALUE);
        }
        distances.put(source,0);
        PriorityQueue<Map.Entry<Integer,Integer>>priorityQueue=new PriorityQueue<>(Map.Entry.comparingByValue());
        priorityQueue.add(new AbstractMap.SimpleEntry<>(source,0));
        while(!priorityQueue.isEmpty()){
          Map.Entry<Integer,Integer>current=
          priorityQueue.poll();
          int currentVertex=current.getKey();
          int currentDistance=current.getValue();
          if(currentDistance>distances.get(currentVertex)){
            continue;
          }
         Map<Integer,Integer>neighbors=graph.get(currentVertex);
         for(Map.Entry<Integer,Ineteger>neighborEntry: neighbpors.entrySet()){
            int neighbor=neighborEntry.getKey();
            int weight=neighborEntry.getValue();
            int distance=currentDistance+weight;
            if(distance<distances.get(neighbor)){
                distance.put(neighbor,distance);
                priorityQueue.add(new AbstractMap.SimpleEntry<>(neighbor,distance));
            
            }
         }
        }
        return distances;
    } 
}