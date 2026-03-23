# AmbientEmitterComponent

Type: class | Package: com.hypixel.hytale.builtin.ambience.components | Implements: Component

public class AmbientEmitterComponent implements Component

## Fields

- public static final BuilderCodec<AmbientEmitterComponent> CODEC
- private String soundEventId
- private Ref<EntityStore> spawnedEmitter

## Methods

- public static ComponentType<EntityStore,AmbientEmitterComponent> getComponentType()
- public String getSoundEventId()
- public void setSoundEventId(String soundEventId)
- public Ref<EntityStore> getSpawnedEmitter()
- public void setSpawnedEmitter(Ref<EntityStore> spawnedEmitter)
- @Nullable @Override public Component<EntityStore> clone()

Also in this package: AmbienceTracker

Complete API:
  public static ComponentType<EntityStore,AmbientEmitterComponent> getComponentType()
  public String getSoundEventId()
  public void setSoundEventId(String soundEventId)
  public Ref<EntityStore> getSpawnedEmitter()
  public void setSpawnedEmitter(Ref<EntityStore> spawnedEmitter)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<AmbientEmitterComponent> CODEC
private String soundEventId
private Ref<EntityStore> spawnedEmitter
