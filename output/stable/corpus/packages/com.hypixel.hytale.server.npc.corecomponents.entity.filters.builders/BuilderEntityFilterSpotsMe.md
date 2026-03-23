# BuilderEntityFilterSpotsMe

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.entity.filters.builders | Extends: BuilderEntityFilterBase

public class BuilderEntityFilterSpotsMe extends BuilderEntityFilterBase

NPC entity filter builder: Checks if the entity can view the NPC in a given view sector or cone and without obstruction..

## Fields

- protected float viewAngle
- protected boolean testLineOfSight
- protected ViewTest viewTest

## Methods

- @Nonnull public EntityFilterSpotsMe build(BuilderSupport builderSupport)
- return new EntityFilterSpotsMe(this)
- @Override public String getShortDescription()
- @Override public String getLongDescription()
- @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public Builder<IEntityFilter> readConfig(@Nonnull JsonElement data)
- public float getViewAngle()
- public boolean testLineOfSight()
- public ViewTest getViewTest()
