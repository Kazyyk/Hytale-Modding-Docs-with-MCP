# EventNotification

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view.event

public class EventNotification

Class in the event subsystem.

## Fields

- initiator | Ref<EntityStore> | Ref<EntityStore> field.
- set | int | int field.

## Methods

- getPosition() | Vector3d | public method.
- setPosition(double x, double y, double z) | void | public method.
- getInitiator() | Ref<EntityStore> | public method.
- setInitiator(Ref<EntityStore> initiator) | void | public method.
- getSet() | int | public method.
- setSet(int set) | void | public method.

Known subclasses: EntityEventNotification

Also in this package: EntityEventNotification, EventTypeRegistration, EventView, IEventCallback

Complete API:
  public Vector3d getPosition()
  public void setPosition(double x, double y, double z)
  public Ref<EntityStore> getInitiator()
  public void setInitiator(Ref<EntityStore> initiator)
  public int getSet()
  public void setSet(int set)

Fields:
private final Vector3d position
private Ref<EntityStore> initiator
private int set
