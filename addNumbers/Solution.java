package addNumbers;

class Solution {
    

    /* 
    ListNode output;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = add(l1,0,0);
        int num2 = add(l2,0,0);
        num1 += num2;
        this.output = new ListNode();
        return buildList(this.output, num1);

    }

    private ListNode buildList(ListNode node, int num){
        int power = (int) Math.floor(Math.log10(num));
        construct(node, power, num);
        return node;
    }

    private ListNode construct(ListNode node,int order, int num){
        if(order == 0){
            node.val = num;
            return node;
        }
        int digit= (int) Math.floorDivExact(num, Math.powExact(10, order));
        num -= digit*(Math.powExact(10,order));
        node.val = digit;
        ListNode nextList = new ListNode();
        node.next = nextList;
        order -= 1;
        return construct(nextList, order, num);
    }

    private int add(ListNode list, int num, int order){
        if(list.next == null){
            num+=list.val*(Math.pow(10,order));
            return num;
        }
        num+=list.val*(Math.pow(10,order));
        order += 1;
        return add(list.next,num,order);

    }*/

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }
    public ListNode add(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }
        int sum = carry;
        if(l1 != null){
            sum += l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            sum += l2.val;
            l2 = l2.next;
        }
        ListNode output = new ListNode(sum % 10);
        output.next = add(l1, l2, sum/10);
        return output;
    }

    

    public static void main(String[] args){
        /* 
        ListNode l1_1 = new ListNode(3);
        ListNode l1_2 = new ListNode(4,l1_1);
        ListNode l1 = new ListNode(2,l1_2);
        ListNode l2_1 = new ListNode(4);
        ListNode l2_2 = new ListNode(6,l2_1);
        ListNode l2 = new ListNode(5,l2_2);
        */
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        Solution solution = new Solution();
        solution.addTwoNumbers(l1, l2);
    }
}