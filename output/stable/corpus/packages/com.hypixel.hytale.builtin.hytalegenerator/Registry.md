# Registry

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class Registry<T>

Generic bidirectional registry mapping objects to sequential integer IDs.

## Key Methods

- public int getIdOrRegister(T object)
- public T getObject(int id)
- public int size()
- public List<T> getAllValues()
- public void forEach(@Nonnull BiConsumer<Integer, T> consumer)

Known subclasses: BlockStateRegistry, ClientFeatureRegistry, CommandRegistry, EntityRegistry, EventRegistry, TaskRegistry

Also in this package: ArrayUtil, BiOperation3i, BlockMask, FutureUtils, Indexer, LoggerUtil, MaterialSet, NakedOperation3i, Operation3i, PropField, Retriever, ReusableList, VectorUtil

Complete API:
  public int getIdOrRegister(T object)
  public T getObject(int id)
  public int size()
  public List<T> getAllValues()
  public void forEach(BiConsumer<Integer,T> consumer)

Fields:
private Map<T,Integer> objectToId
private Map<Integer,T> idToObject
