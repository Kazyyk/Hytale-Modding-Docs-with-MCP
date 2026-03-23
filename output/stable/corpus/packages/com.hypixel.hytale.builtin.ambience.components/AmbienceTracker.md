# AmbienceTracker

Type: class | Package: com.hypixel.hytale.builtin.ambience.components | Implements: Component

public class AmbienceTracker implements Component

## Fields

- private final UpdateEnvironmentMusic musicPacket
- private int forcedMusicIndex

## Methods

- public static ComponentType<EntityStore,AmbienceTracker> getComponentType()
- public void setForcedMusicIndex(int forcedMusicIndex)
- public int getForcedMusicIndex()
- @Nonnull public UpdateEnvironmentMusic getMusicPacket()
- @Nullable @Override public Component<EntityStore> clone()

Also in this package: AmbientEmitterComponent

Complete API:
  public static ComponentType<EntityStore,AmbienceTracker> getComponentType()
  public void setForcedMusicIndex(int forcedMusicIndex)
  public int getForcedMusicIndex()
  public UpdateEnvironmentMusic getMusicPacket()
  public Component<EntityStore> clone()

Fields:
private final UpdateEnvironmentMusic musicPacket
private int forcedMusicIndex
