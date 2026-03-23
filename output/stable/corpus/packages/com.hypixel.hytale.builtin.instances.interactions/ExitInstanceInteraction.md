# ExitInstanceInteraction

Type: class | Package: com.hypixel.hytale.builtin.instances.interactions | Extends: SimpleInstantInteraction

public class ExitInstanceInteraction extends SimpleInstantInteraction

## Fields

- public static final BuilderCodec<ExitInstanceInteraction> CODEC
- CommandBuffer<EntityStore> commandBuffer
- Ref<EntityStore> ref
- Player playerComponent
- Archetype<EntityStore> archetype

## Methods

- public WaitForDataFrom getWaitForDataFrom()
- protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

Also in this package: OriginSource, TeleportConfigInstanceInteraction, TeleportInstanceInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)

Fields:
public static final BuilderCodec<ExitInstanceInteraction> CODEC
