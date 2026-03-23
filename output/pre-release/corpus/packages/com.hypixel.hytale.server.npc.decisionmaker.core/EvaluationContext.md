# EvaluationContext

Type: class | Package: com.hypixel.hytale.server.npc.decisionmaker.core

public class EvaluationContext

Context object providing state information during NPC decision-making evaluation including entity reference and store access.

Also in this package: ConditionReference, Evaluator, Option, OptionHolder

Complete API:
  public double getMinimumUtility()
  public void setMinimumUtility(double minimumUtility)
  public double getMinimumWeightCoefficient()
  public void setMinimumWeightCoefficient(double minimumWeightCoefficient)
  public float getPredictability()
  public void setPredictability(float predictability)
  public long getLastUsedNanos()
  public void setLastUsedNanos(long lastUsedNanos)
  public void reset()

Fields:
private double minimumUtility
private double minimumWeightCoefficient
private float predictability
private long lastUsedNanos
