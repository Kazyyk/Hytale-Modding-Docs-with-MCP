# BuilderSensorDamage

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat.builders | Extends: BuilderSensorBase

public class BuilderSensorDamage extends BuilderSensorBase

NPC behavior sensor builder for SensorDamage functionality.

## Constants

- public static final String[] REQUIRE_ONE_OF
- public static final String[] ANTECEDENT
- public static final String[] SUBSEQUENT

## Fields

- protected boolean combatDamage
- protected boolean friendlyDamage
- protected boolean drowningDamage
- protected boolean environmentDamage
- protected boolean otherDamage
- protected String targetSlot

## Methods

- @Nonnull public SensorDamage build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public boolean isCombatDamage()
- public boolean isFriendlyDamage()
- public boolean isDrowningDamage()
- public boolean isEnvironmentDamage()
- public boolean isOtherDamage()
- public int getTargetSlot(@Nonnull BuilderSupport support)
