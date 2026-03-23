# Option

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core

public class Option

Represents a single option in the NPC decision-making system with associated score and action.

Known subclasses: CombatActionOption, RunOption, StateOption

Also in this package: ConditionReference, EvaluationContext, Evaluator, OptionHolder

Complete API:
  public String[] getConditions()
  public double getWeightCoefficient()
  public void sortConditions()
  public void setupNPC(Role role)
  public void setupNPC(Holder<EntityStore> holder)
  public double calculateUtility(int selfIndex, ArchetypeChunk<EntityStore> archetypeChunk, Ref<EntityStore> target, CommandBuffer<EntityStore> commandBuffer, EvaluationContext context)
  public String toString()

Fields:
public static final BuilderCodec<Option> ABSTRACT_CODEC
protected String description
protected String[] conditions
protected double weightCoefficient
protected Option.ConditionReference[] sortedConditions
