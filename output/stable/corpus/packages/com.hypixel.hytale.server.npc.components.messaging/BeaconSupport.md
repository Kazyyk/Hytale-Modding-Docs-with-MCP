# BeaconSupport

Type: class | Package: com.hypixel.hytale.server.npc.components.messaging | Extends: MessageSupport | Implements: Component<EntityStore>

public class BeaconSupport extends MessageSupport implements Component<EntityStore>

## Fields

- private NPCMessage[] messageSlots
- private Object2IntMap<String> messageIndices
- private Int2ObjectMap<String> indicesToMessages

## Methods

- public static ComponentType<EntityStore, BeaconSupport> getComponentType()
- public void postMessage(String message, Ref<EntityStore> target, double age)
- @Nullable public Ref<EntityStore> pollMessage(int messageIndex)
- @Nullable public Ref<EntityStore> peekMessage(int messageIndex)
- public void initialise(@Nonnull Object2IntMap<String> messageIndices)
- public String getMessageTextForIndex(int messageIndex)
- @Override public NPCMessage[] getMessageSlots()
- @Nonnull @Override public Component<EntityStore> clone()

Also in this package: EntityEventSupport, EventMessage, EventSupport, MessageSupport, NPCBlockEventSupport, NPCEntityEventSupport, NPCMessage, PlayerBlockEventSupport, PlayerEntityEventSupport

Complete API:
  public static ComponentType<EntityStore,BeaconSupport> getComponentType()
  public void postMessage(String message, Ref<EntityStore> target, double age)
  public Ref<EntityStore> pollMessage(int messageIndex)
  public Ref<EntityStore> peekMessage(int messageIndex)
  public void initialise(Object2IntMap<String> messageIndices)
  public String getMessageTextForIndex(int messageIndex)
  public NPCMessage[] getMessageSlots()
  public Component<EntityStore> clone()

Fields:
private NPCMessage[] messageSlots
private Object2IntMap<String> messageIndices
private Int2ObjectMap<String> indicesToMessages
