# WorkerIndexer.Data

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.workerindexer | Extends: java.lang.Object

public static class Data<T>

A typed per-worker data container. Each worker ID maps to an independently initialized data slot.

Also in this package: Id, Session, WorkerIndexer

Complete API:
  public boolean isValid(WorkerIndexer.Id id)
  public T get(WorkerIndexer.Id id)
  public void set(WorkerIndexer.Id id, T value)
  public void forEach(BiConsumer<WorkerIndexer.Id,T> consumer)

Fields:
private T[] data
private Supplier<T> initialize
