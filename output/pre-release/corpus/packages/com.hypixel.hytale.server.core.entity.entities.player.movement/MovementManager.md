# MovementManager

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.movement

public class MovementManager

Manages player movement state and physics. Handles movement mode transitions (walk, sprint, fly, swim, climb), processes input from the client, applies movement configs, and enforces server-authoritative position validation.

Also in this package: MovementConfig

Complete API:
  public static ComponentType<EntityStore,MovementManager> getComponentType()
  public void resetDefaultsAndUpdate(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void refreshDefaultSettings(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void applyDefaultSettings()
  public void update(PacketHandler playerPacketHandler)
  public MovementSettings getSettings()
  public void setDefaultSettings(MovementSettings settings, PhysicsValues physicsValues, GameMode gameMode)
  public MovementSettings getDefaultSettings()
  public String toString()
  public Component<EntityStore> clone()

Fields:
public static final BiFunction<PhysicsValues,GameMode,MovementSettings> MASTER_DEFAULT
protected MovementSettings defaultSettings
protected MovementSettings settings
