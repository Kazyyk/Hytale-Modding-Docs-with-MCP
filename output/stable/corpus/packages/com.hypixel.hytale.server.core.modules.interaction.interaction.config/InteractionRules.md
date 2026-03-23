# InteractionRules

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.InteractionRules>

public class InteractionRules implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionRules>

Defines blocking, interruption, and bypass rules that control when interactions can start or must stop.

## Constants

- BuilderCodec<InteractionRules> CODEC

## Key Methods

- public boolean validateInterrupts(@Nonnull InteractionType type, @Nonnull Int2ObjectMap<IntSet> selfTags, @Nonnull InteractionType otherType, @Nonnull Int2ObjectMap<IntSet> otherTags, @Nonnull InteractionRules otherRules)
- public boolean validateBlocked(@Nonnull InteractionType type, @Nonnull Int2ObjectMap<IntSet> selfTags, @Nonnull InteractionType otherType, @Nonnull Int2ObjectMap<IntSet> otherTags, @Nonnull InteractionRules otherRules)
- public com.hypixel.hytale.protocol.InteractionRules toPacket()
- public String toString()

Also in this package: Interaction, InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionTypeUtils, RootInteraction, SimpleInstantInteraction, SimpleInteraction

Complete API:
  public boolean validateInterrupts(InteractionType type, Int2ObjectMap<IntSet> selfTags, InteractionType otherType, Int2ObjectMap<IntSet> otherTags, InteractionRules otherRules)
  public boolean validateBlocked(InteractionType type, Int2ObjectMap<IntSet> selfTags, InteractionType otherType, Int2ObjectMap<IntSet> otherTags, InteractionRules otherRules)
  public com.hypixel.hytale.protocol.InteractionRules toPacket()
  public String toString()

Fields:
public static final BuilderCodec<InteractionRules> CODEC
public static InteractionRules DEFAULT_RULES
protected Set<InteractionType> blockedBy
protected Set<InteractionType> blocking
protected Set<InteractionType> interruptedBy
protected Set<InteractionType> interrupting
protected String blockedByBypass
protected int blockedByBypassIndex
protected String blockingBypass
protected int blockingBypassIndex
protected String interruptedByBypass
protected int interruptedByBypassIndex
protected String interruptingBypass
protected int interruptingBypassIndex
