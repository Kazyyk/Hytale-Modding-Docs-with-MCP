# NPCMessage

Type: class | Package: com.hypixel.hytale.server.npc.components.messaging

public class NPCMessage

## Fields

- public static final double AGE_INFINITE
- private boolean enabled
- private boolean activated
- private double age
- private Ref<EntityStore> target

## Methods

- public boolean tickAge(float dt)
- public boolean isEnabled()
- public void setEnabled(boolean enabled)
- public boolean isActivated()
- public boolean isInfinite()
- @Nullable public Ref<EntityStore> getTarget()
- public void activate(Ref<EntityStore> target, double age)
- public void deactivate()
- @Nonnull public NPCMessage clone()

Known subclasses: EventMessage

Also in this package: BeaconSupport, EntityEventSupport, EventMessage, EventSupport, MessageSupport, NPCBlockEventSupport, NPCEntityEventSupport, PlayerBlockEventSupport, PlayerEntityEventSupport

Complete API:
  public boolean tickAge(float dt)
  public boolean isEnabled()
  public void setEnabled(boolean enabled)
  public boolean isActivated()
  public boolean isInfinite()
  public Ref<EntityStore> getTarget()
  public void activate(Ref<EntityStore> target, double age)
  public void deactivate()
  public NPCMessage clone()

Fields:
public static final double AGE_INFINITE
private boolean enabled
private boolean activated
private double age
private Ref<EntityStore> target
