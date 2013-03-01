package powercrystals.minefactoryreloaded.animals;

import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import powercrystals.minefactoryreloaded.MineFactoryReloadedCore;

public class ItemHealthSyringe extends ItemSyringe
{
	public ItemHealthSyringe()
	{
		super(MineFactoryReloadedCore.syringeHealthItemId.getInt());
	}
	
	@Override
	public boolean canInject(World world, EntityLiving entity, ItemStack syringe)
	{
		return entity.getHealth() < entity.getMaxHealth();
	}
	
	@Override
	public boolean inject(World world, EntityLiving entity, ItemStack syringe)
	{
		entity.heal(2);
		return true;
	}
}
