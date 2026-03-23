# BuilderHeadMotionAim

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat.builders | Extends: BuilderHeadMotionBase

public class BuilderHeadMotionAim extends BuilderHeadMotionBase

NPC behavior motion builder for HeadMotionAim functionality.

## Fields

- protected final DoubleHolder spread
- protected final BooleanHolder deflection
- protected final DoubleHolder hitProbability
- protected final DoubleHolder relativeTurnSpeed

## Methods

- @Nonnull public HeadMotionAim build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderHeadMotionAim readConfig(@Nonnull JsonElement data)
- public double getSpread(BuilderSupport support)
- public boolean isDeflection(BuilderSupport support)
- public double getHitProbability(BuilderSupport support)
- public double getRelativeTurnSpeed(@Nonnull BuilderSupport support)
