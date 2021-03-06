package crazypants.enderio.base.fluid;

import javax.annotation.Nonnull;

import net.minecraftforge.fluids.Fluid;

public interface IFluidFuel {

  @Nonnull
  Fluid getFluid();

  int getTotalBurningTime();

  int getPowerPerCycle();
}
