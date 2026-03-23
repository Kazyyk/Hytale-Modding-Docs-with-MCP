# MessageSupport

Type: class | Package: com.hypixel.hytale.server.npc.components.messaging | Implements: Component<EntityStore>

public abstract class MessageSupport implements Component<EntityStore>

## Methods

- public abstract NPCMessage[] getMessageSlots()
- public boolean isMessageQueued(int messageIndex)
- public boolean isMessageEnabled(int messageIndex)
- @Override public abstract Component<EntityStore> clone()

Known subclasses: BeaconSupport, EventSupport

Also in this package: BeaconSupport, EntityEventSupport, EventMessage, EventSupport, NPCBlockEventSupport, NPCEntityEventSupport, NPCMessage, PlayerBlockEventSupport, PlayerEntityEventSupport

Complete API:
  public abstract NPCMessage[] getMessageSlots()
  public boolean isMessageQueued(int messageIndex)
  public boolean isMessageEnabled(int messageIndex)
  public abstract Component<EntityStore> clone()
