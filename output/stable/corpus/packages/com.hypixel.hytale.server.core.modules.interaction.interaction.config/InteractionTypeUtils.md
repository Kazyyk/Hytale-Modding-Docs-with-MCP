# InteractionTypeUtils

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config

public class InteractionTypeUtils

Utility constants and methods for interaction type defaults, including standard input sets, default blocked-by mappings, and collision type checks.

## Constants

- Set<InteractionType> STANDARD_INPUT
- float DEFAULT_COOLDOWN

## Key Methods

- public static float getDefaultCooldown(@Nonnull InteractionType type)
- public static boolean isCollisionType(@Nonnull InteractionType type)

Also in this package: Interaction, InteractionCamera, InteractionCameraSettings, InteractionConfiguration, InteractionEffects, InteractionPriority, InteractionPriorityCodec, InteractionRules, RootInteraction, SimpleInstantInteraction, SimpleInteraction

Complete API:
  public static float getDefaultCooldown(InteractionType type)
  public static boolean isCollisionType(InteractionType type)

Fields:
public static final Set<InteractionType> STANDARD_INPUT
public static final Map<InteractionType,Set<InteractionType>> DEFAULT_INTERACTION_BLOCKED_BY
public static final float DEFAULT_COOLDOWN
