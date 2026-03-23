# PrefabCopyableComponent

Type: class | Package: com.hypixel.hytale.server.core.prefab | Implements: Component<EntityStore>

public class PrefabCopyableComponent implements Component<EntityStore>

Singleton marker component indicating that an entity can be copied as part of a prefab operation. Uses a single shared `INSTANCE` -- cloning returns the same instance. Registered on `EntityModule`.

## Fields

- public static final PrefabCopyableComponent INSTANCE
- public static final BuilderCodec<PrefabCopyableComponent> CODEC

## Methods

- public static ComponentType<EntityStore, PrefabCopyableComponent> getComponentType()
- public static PrefabCopyableComponent get()
- public Component<EntityStore> clone()

Also in this package: AssetPackPrefabPath, PrefabEntry, PrefabLoadException, PrefabRotation, PrefabSaveException, PrefabStore, PrefabWeights, RotationExecutor, RotationExecutor_0, RotationExecutor_180, RotationExecutor_270, RotationExecutor_90, Type, Type, WeightMapValidator

Complete API:
  public static ComponentType<EntityStore,PrefabCopyableComponent> getComponentType()
  public static PrefabCopyableComponent get()
  public Component<EntityStore> clone()

Fields:
public static final PrefabCopyableComponent INSTANCE
public static final BuilderCodec<PrefabCopyableComponent> CODEC
