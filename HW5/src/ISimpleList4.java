
public interface ISimpleList4<ItemType> extends ISimpleList3<ItemType>{
	public void insertEnd(ItemType item);
	public ItemType removeEnd();
	public int length();
	public ItemType seeFirstValue();
	public ItemType seeLastValue();
}
