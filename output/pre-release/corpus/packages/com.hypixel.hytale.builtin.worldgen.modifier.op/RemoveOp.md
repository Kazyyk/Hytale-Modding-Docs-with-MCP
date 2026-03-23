# RemoveOp

Type: class | Package: com.hypixel.hytale.builtin.worldgen.modifier.op | Extends: java.lang.Object | Implements: Op

public class RemoveOp implements Op

An operation that removes matching entries from the target world-gen content list using glob rules.

Also in this package: AddOp, Op

Complete API:
  public void apply(ModifyEvent<T> event)
  protected static void removePrefabs(ModifyEvent<T> event, String[] rules, ListPool<T> pool, Function<T,IWeightedMap<WorldGenPrefabSupplier>> prefabGetter)
  protected static void removeContent(ModifyEvent<T> event, String[] rules, ListPool<T> pool, Function<T,String> identityGetter)
  protected static void modifyEventContent(List<T> entries, ModifyEvent<T> event)

Fields:
public static final String ID
public static final BuilderCodec<RemoveOp> CODEC
private String[] rules
private transient boolean isClearAll
