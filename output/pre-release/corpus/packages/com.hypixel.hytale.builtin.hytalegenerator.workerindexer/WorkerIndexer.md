# WorkerIndexer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.workerindexer | Extends: java.lang.Object

public class WorkerIndexer

Manages indexed worker threads for parallel world generation. Creates typed worker IDs and sessions for thread-safe data access.

Also in this package: Data, Id, Session

Complete API:
  public int getWorkerCount()
  public List<WorkerIndexer.Id> getWorkedIds()
  public WorkerIndexer.Session createSession()

Fields:
private final int workerCount
private final List<WorkerIndexer.Id> ids
